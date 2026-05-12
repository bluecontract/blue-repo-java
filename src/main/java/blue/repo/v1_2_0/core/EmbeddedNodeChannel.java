package blue.repo.v1_2_0.core;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("Fjbu3QpnUaTruDTcTidETCX2N5STyv7KYxT42PCzGHxm")
public class EmbeddedNodeChannel extends blue.language.processor.model.EmbeddedNodeChannel {
    public static String blueId() {
        return "Fjbu3QpnUaTruDTcTidETCX2N5STyv7KYxT42PCzGHxm";
    }

    public static String packageName() {
        return "Core";
    }

    public static String typeName() {
        return "Embedded Node Channel";
    }

    public static String qualifiedName() {
        return "Core/Embedded Node Channel";
    }

    public static String resourcePath() {
        return "blue/repo/v1_2_0/definitions/Core/EmbeddedNodeChannel.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private Node event;

    public Node getEvent() {
        return event;
    }

    public EmbeddedNodeChannel event(Node event) {
        this.event = event;
        return this;
    }

}
