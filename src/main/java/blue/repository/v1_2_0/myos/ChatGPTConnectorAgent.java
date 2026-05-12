package blue.repository.v1_2_0.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repository.RepositoryType;

@TypeBlueId("3u1bvMQqqc9sj4zWmwwhQrbdfCn7xrGiN7KEczqq22XG")
public class ChatGPTConnectorAgent extends Agent {
    public static String blueId() {
        return "3u1bvMQqqc9sj4zWmwwhQrbdfCn7xrGiN7KEczqq22XG";
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
        return "blue/repository/v1_2_0/definitions/MyOS/ChatGPTConnectorAgent.json";
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
