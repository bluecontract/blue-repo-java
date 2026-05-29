package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("9jVnm8QTU2vXFaozdAwXe5y66wfab3xxkXtynUf4PwVn")
public class ChatGPTConnectorAgent extends Agent {
    public static String blueId() {
        return "9jVnm8QTU2vXFaozdAwXe5y66wfab3xxkXtynUf4PwVn";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "Chat GPT Connector Agent";
    }

    public static String qualifiedName() {
        return "MyOS/Chat GPT Connector Agent";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/ChatGPTConnectorAgent.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node contracts;

    public Node getContracts() {
        return contracts;
    }

    public ChatGPTConnectorAgent contracts(Node contracts) {
        this.contracts = contracts;
        return this;
    }

}
