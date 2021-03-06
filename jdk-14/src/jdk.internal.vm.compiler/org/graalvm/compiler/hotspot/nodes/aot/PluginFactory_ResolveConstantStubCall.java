// CheckStyle: stop header check
// CheckStyle: stop line length check
// GENERATED CONTENT - DO NOT EDIT
// GENERATORS: org.graalvm.compiler.replacements.processor.ReplacementsAnnotationProcessor, org.graalvm.compiler.replacements.processor.PluginGenerator
package org.graalvm.compiler.hotspot.nodes.aot;

import jdk.vm.ci.meta.ResolvedJavaMethod;

import java.lang.annotation.Annotation;
import org.graalvm.compiler.nodes.ValueNode;
import org.graalvm.compiler.nodes.graphbuilderconf.GraphBuilderContext;
import org.graalvm.compiler.nodes.graphbuilderconf.GeneratedInvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugin;
import org.graalvm.compiler.nodes.graphbuilderconf.InvocationPlugins;
import org.graalvm.compiler.nodes.graphbuilderconf.NodeIntrinsicPluginFactory;

import jdk.vm.ci.meta.JavaKind;

//        class: org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall
//       method: resolveKlass(org.graalvm.compiler.hotspot.word.KlassPointer,org.graalvm.compiler.word.Word)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
final class Plugin_ResolveConstantStubCall_resolveKlass__0 extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        ValueNode arg0 = args[0];
        ValueNode arg1 = args[1];
        org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall node = new org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall(arg0, arg1);
        b.addPush(JavaKind.Object, node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
    }
}

//        class: org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall
//       method: resolveKlass(org.graalvm.compiler.hotspot.word.KlassPointer,org.graalvm.compiler.word.Word,org.graalvm.compiler.hotspot.meta.HotSpotConstantLoadAction)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
final class Plugin_ResolveConstantStubCall_resolveKlass__1 extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        ValueNode arg0 = args[0];
        ValueNode arg1 = args[1];
        org.graalvm.compiler.hotspot.meta.HotSpotConstantLoadAction arg2;
        if (args[2].isConstant()) {
            arg2 = snippetReflection.asObject(org.graalvm.compiler.hotspot.meta.HotSpotConstantLoadAction.class, args[2].asJavaConstant());
        } else {
            assert b.canDeferPlugin(this) : b.getClass().toString();
            return false;
        }
        org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall node = new org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall(arg0, arg1, arg2);
        b.addPush(JavaKind.Object, node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
    }

    private final org.graalvm.compiler.api.replacements.SnippetReflectionProvider snippetReflection;

    Plugin_ResolveConstantStubCall_resolveKlass__1(NodeIntrinsicPluginFactory.InjectionProvider injection) {
        this.snippetReflection = injection.getInjectedArgument(org.graalvm.compiler.api.replacements.SnippetReflectionProvider.class);
    }
}

//        class: org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall
//       method: resolveObject(java.lang.Object,java.lang.Object)
// generated-by: org.graalvm.compiler.replacements.processor.GeneratedNodeIntrinsicPlugin$ConstructorPlugin
final class Plugin_ResolveConstantStubCall_resolveObject extends GeneratedInvocationPlugin {

    @Override
    public boolean execute(GraphBuilderContext b, ResolvedJavaMethod targetMethod, InvocationPlugin.Receiver receiver, ValueNode[] args) {
        if (!b.isPluginEnabled(this)) {
            return false;
        }
        ValueNode arg0 = args[0];
        ValueNode arg1 = args[1];
        org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall node = new org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall(arg0, arg1);
        b.addPush(JavaKind.Object, node);
        return true;
    }
    @Override
    public Class<? extends Annotation> getSource() {
        return org.graalvm.compiler.graph.Node.NodeIntrinsic.class;
    }
}

public class PluginFactory_ResolveConstantStubCall implements NodeIntrinsicPluginFactory {
    @Override
    public void registerPlugins(InvocationPlugins plugins, NodeIntrinsicPluginFactory.InjectionProvider injection) {
        plugins.register(new Plugin_ResolveConstantStubCall_resolveKlass__0(), org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall.class, "resolveKlass", org.graalvm.compiler.hotspot.word.KlassPointer.class, org.graalvm.compiler.word.Word.class);
        plugins.register(new Plugin_ResolveConstantStubCall_resolveKlass__1(injection), org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall.class, "resolveKlass", org.graalvm.compiler.hotspot.word.KlassPointer.class, org.graalvm.compiler.word.Word.class, org.graalvm.compiler.hotspot.meta.HotSpotConstantLoadAction.class);
        plugins.register(new Plugin_ResolveConstantStubCall_resolveObject(), org.graalvm.compiler.hotspot.nodes.aot.ResolveConstantStubCall.class, "resolveObject", java.lang.Object.class, java.lang.Object.class);
    }
}
