package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import blue.repo.core.Channel;
import java.util.Map;

@TypeBlueId("5cg55kgH8ckRVji4oWSBBxthJQFYmB5Lb1Pea7achyNr")
public class MyOSPackage extends Agent {
    public static String blueId() {
        return "5cg55kgH8ckRVji4oWSBBxthJQFYmB5Lb1Pea7achyNr";
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

    private Map<String, Channel> channelBindings;

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

    public Map<String, Channel> getChannelBindings() {
        return channelBindings;
    }

    public MyOSPackage channelBindings(Map<String, Channel> channelBindings) {
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
