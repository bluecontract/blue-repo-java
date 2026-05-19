package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EwcG5eFNCQi9YWs6ikftaqnXGs5x5b3n4u6DrJiiCqM6")
public class FinInstrm {
    public static String blueId() {
        return "EwcG5eFNCQi9YWs6ikftaqnXGs5x5b3n4u6DrJiiCqM6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "FinInstrm";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/FinInstrm";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/FinInstrm.json";
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

    private Othr othr;

    public String getNamespace() {
        return namespace;
    }

    public FinInstrm namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public Othr getOthr() {
        return othr;
    }

    public FinInstrm othr(Othr othr) {
        this.othr = othr;
        return this;
    }

}
