package blue.repo.myos;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("6fj4VDzQZwkBBPsYP4DGeSPbnHCQmX11PG3Vtk9pLRMF")
public class MyOSSessionSubscriptionFilter {
    public static String blueId() {
        return "6fj4VDzQZwkBBPsYP4DGeSPbnHCQmX11PG3Vtk9pLRMF";
    }

    public static String packageName() {
        return "MyOS";
    }

    public static String typeName() {
        return "MyOS Session Subscription Filter";
    }

    public static String qualifiedName() {
        return "MyOS/MyOS Session Subscription Filter";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/MyOS/MyOSSessionSubscriptionFilter.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<Node> events;

    private Node snapshots;

    public List<Node> getEvents() {
        return events;
    }

    public MyOSSessionSubscriptionFilter events(List<Node> events) {
        this.events = events;
        return this;
    }

    public Node getSnapshots() {
        return snapshots;
    }

    public MyOSSessionSubscriptionFilter snapshots(Node snapshots) {
        this.snapshots = snapshots;
        return this;
    }

}
