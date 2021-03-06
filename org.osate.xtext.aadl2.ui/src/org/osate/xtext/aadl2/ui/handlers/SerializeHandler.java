package org.osate.xtext.aadl2.ui.handlers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.resources.IResource;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.text.ITextSelection;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.TreeSelection;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.views.contentoutline.ContentOutline;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.resource.SaveOptions;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.serializer.ISerializer;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.util.concurrent.IUnitOfWork;
import org.osate.aadl2.Element;
import org.osate.aadl2.modelsupport.resources.OsateResourceUtil;
import org.osate.aadl2.util.Aadl2ResourceFactoryImpl;
import org.osate.aadl2.util.Aadl2ResourceImpl;
import org.osate.core.OsateCorePlugin;
import org.osate.workspace.WorkspacePlugin;
import org.osate.xtext.aadl2.serializing.*;
import org.osate.xtext.aadl2.util.AadlUnparser;

import com.google.inject.Inject;
import com.google.inject.Injector;

public class SerializeHandler extends AbstractHandler {


	@Inject
	private EObjectAtOffsetHelper eObjectAtOffsetHelper;

	public Object execute(ExecutionEvent event) throws ExecutionException {
		IWorkbench wb = PlatformUI.getWorkbench();
		IWorkbenchWindow win = wb.getActiveWorkbenchWindow();
		IWorkbenchPage page = win.getActivePage();
		IWorkbenchPart part = page.getActivePart();
		IEditorPart activeEditor = page.getActiveEditor();
		ISelection selection= page.getSelection();;
		if (selection instanceof TreeSelection){
			for (Iterator iterator = ((TreeSelection)selection).iterator(); iterator.hasNext();) {
				Object f = (Object) iterator.next();
				if (f instanceof IResource){
					Resource res = OsateResourceUtil.getResource((IResource)f);
					saveBySerialize2(res);
				}
			}
			return null;
		}
		return null;
	}
	
	/**
	 * method uses XText Serializer
	 * Have had problems with it
	 * @param res
	 */
	private void saveBySerialize2(Resource res){
		URI xtxturi = res.getURI();
		String name = xtxturi.trimFileExtension().lastSegment();
		URI txturi = xtxturi.trimFileExtension().trimSegments(1).appendSegment(name+"_serialize").appendFileExtension("aadl");
		XtextResource aadlresource = (XtextResource) res.getResourceSet().createResource(txturi);
		aadlresource.getContents().add(res.getContents().get(0));
		SaveOptions.Builder sb = SaveOptions.newBuilder();
		Map<Object,Object> options = new HashMap();
		sb.getOptions().addTo(options);
		try {
			aadlresource.save(options);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
