package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.Map;

@TypeBlueId("FX9yvQWAiZMMwnUF1vY1HMumJNNg7ENP7ETxha1kvWkn")
public class MyOSPackage extends Agent {
    public static String blueId() {
        return "FX9yvQWAiZMMwnUF1vY1HMumJNNg7ENP7ETxha1kvWkn";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Package";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Package";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSPackage.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node document;

    private String agentStoreDescription;

    private Map<String, Node> channelBindings;

    private String installerChannel;

    private Node initialMessages;

    private Map<String, Boolean> capabilities;

    private AnchorAutomationTemplate automationTemplate;

    public Node getDocument() {
        return document;
    }

    public MyOSPackage document(Node document) {
        this.document = document;
        return this;
    }

    public String getAgentStoreDescription() {
        return agentStoreDescription;
    }

    public MyOSPackage agentStoreDescription(String agentStoreDescription) {
        this.agentStoreDescription = agentStoreDescription;
        return this;
    }

    public Map<String, Node> getChannelBindings() {
        return channelBindings;
    }

    public MyOSPackage channelBindings(Map<String, Node> channelBindings) {
        this.channelBindings = channelBindings;
        return this;
    }

    public String getInstallerChannel() {
        return installerChannel;
    }

    public MyOSPackage installerChannel(String installerChannel) {
        this.installerChannel = installerChannel;
        return this;
    }

    public Node getInitialMessages() {
        return initialMessages;
    }

    public MyOSPackage initialMessages(Node initialMessages) {
        this.initialMessages = initialMessages;
        return this;
    }

    public Map<String, Boolean> getCapabilities() {
        return capabilities;
    }

    public MyOSPackage capabilities(Map<String, Boolean> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    public AnchorAutomationTemplate getAutomationTemplate() {
        return automationTemplate;
    }

    public MyOSPackage automationTemplate(AnchorAutomationTemplate automationTemplate) {
        this.automationTemplate = automationTemplate;
        return this;
    }

}
