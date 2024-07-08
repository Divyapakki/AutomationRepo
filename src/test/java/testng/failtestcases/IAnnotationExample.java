package testng.failtestcases;

import org.testng.IAnnotationTransformer;

import static jdk.javadoc.internal.doclets.formats.html.markup.HtmlStyle.annotations;

public class IAnnotationExample implements IAnnotationTransformer {

    public void transform(org.testng.annotations.ITestAnnotation annotation, java.lang.Class testClass, java.lang.reflect.Constructor testConstructor, java.lang.reflect.Method testMethod) {

        //annotations.setRetryAnalyzer(FailTestScriptsRuns.class);

    }

}
