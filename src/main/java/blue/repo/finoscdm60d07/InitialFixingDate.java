package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("2Bg9Wtbm8rGyt7FkaUWdWo85QoBsAwhy8tZzZGC9c2yZ")
public class InitialFixingDate {
    public static String blueId() {
        return "2Bg9Wtbm8rGyt7FkaUWdWo85QoBsAwhy8tZzZGC9c2yZ";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "InitialFixingDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/InitialFixingDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/InitialFixingDate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String namespace;

    private String initialFixingDate;

    private RelativeDateOffset relativeDateOffset;

    public String getNamespace() {
        return namespace;
    }

    public InitialFixingDate namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getInitialFixingDate() {
        return initialFixingDate;
    }

    public InitialFixingDate initialFixingDate(String initialFixingDate) {
        this.initialFixingDate = initialFixingDate;
        return this;
    }

    public RelativeDateOffset getRelativeDateOffset() {
        return relativeDateOffset;
    }

    public InitialFixingDate relativeDateOffset(RelativeDateOffset relativeDateOffset) {
        this.relativeDateOffset = relativeDateOffset;
        return this;
    }

}
