package io.jenkins.plugins.cyberchief;

import org.junit.Rule;
import org.jvnet.hudson.test.JenkinsRule;

public class CyberChiefScanBuilderTest {

    @Rule
    public JenkinsRule jenkins = new JenkinsRule();
    // TODO:
    // @Test
    // public void testConfigRoundtrip() throws Exception {
    //     FreeStyleProject project = jenkins.createFreeStyleProject();
    //     project.getBuildersList().add(new HelloWorldBuilder(name));
    //     project = jenkins.configRoundtrip(project);
    //     jenkins.assertEqualDataBoundBeans(
    //             new HelloWorldBuilder(name), project.getBuildersList().get(0));
    // }

    // @Test
    // public void testConfigRoundtripFrench() throws Exception {
    //     FreeStyleProject project = jenkins.createFreeStyleProject();
    //     HelloWorldBuilder builder = new HelloWorldBuilder(name);
    //     builder.setUseFrench(true);
    //     project.getBuildersList().add(builder);
    //     project = jenkins.configRoundtrip(project);

    //     HelloWorldBuilder lhs = new HelloWorldBuilder(name);
    //     lhs.setUseFrench(true);
    //     jenkins.assertEqualDataBoundBeans(lhs, project.getBuildersList().get(0));
    // }

    // @Test
    // public void testBuild() throws Exception {
    //     FreeStyleProject project = jenkins.createFreeStyleProject();
    //     HelloWorldBuilder builder = new HelloWorldBuilder('test-token');
    //     project.getBuildersList().add(builder);

    //     FreeStyleBuild build = jenkins.buildAndAssertSuccess(project);
    //     jenkins.assertLogContains("Hello, " + name, build);
    // }

    // @Test
    // public void testBuildFrench() throws Exception {

    //     FreeStyleProject project = jenkins.createFreeStyleProject();
    //     HelloWorldBuilder builder = new HelloWorldBuilder(name);
    //     builder.setUseFrench(true);
    //     project.getBuildersList().add(builder);

    //     FreeStyleBuild build = jenkins.buildAndAssertSuccess(project);
    //     jenkins.assertLogContains("Bonjour, " + name, build);
    // }

    // @Test
    // public void testScriptedPipeline() throws Exception {
    //     String agentLabel = "my-agent";
    //     jenkins.createOnlineSlave(Label.get(agentLabel));
    //     WorkflowJob job = jenkins.createProject(WorkflowJob.class, "test-scripted-pipeline");
    //     String pipelineScript = "node {greet '" + name + "'}";
    //     job.setDefinition(new CpsFlowDefinition(pipelineScript, true));
    //     WorkflowRun completedBuild = jenkins.assertBuildStatusSuccess(job.scheduleBuild2(0));
    //     String expectedString = "Hello, " + name + "!";
    //     jenkins.assertLogContains(expectedString, completedBuild);
    // }
}
