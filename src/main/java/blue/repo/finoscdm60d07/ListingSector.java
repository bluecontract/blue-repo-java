package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("D6PhQm48MpEyjFhkjQCnYWuaEVG6XXnXiZ4iCZPnke1k")
public class ListingSector {
    public static String blueId() {
        return "D6PhQm48MpEyjFhkjQCnYWuaEVG6XXnXiZ4iCZPnke1k";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "ListingSector";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/ListingSector";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/ListingSector.json";
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

    private List<FieldWithMetaString> sector;

    public String getNamespace() {
        return namespace;
    }

    public ListingSector namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<FieldWithMetaString> getSector() {
        return sector;
    }

    public ListingSector sector(List<FieldWithMetaString> sector) {
        this.sector = sector;
        return this;
    }

}
