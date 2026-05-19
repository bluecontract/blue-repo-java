package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("AWZDXVBidZBNsSNjQCbFTfYo4iqiEX7VCVEbJGALU6WH")
public class TaxonomyClassification {
    public static String blueId() {
        return "AWZDXVBidZBNsSNjQCbFTfYo4iqiEX7VCVEbJGALU6WH";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "TaxonomyClassification";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/TaxonomyClassification";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/TaxonomyClassification.json";
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

    private String className;

    private BigInteger ordinal;

    private String val;

    public String getNamespace() {
        return namespace;
    }

    public TaxonomyClassification namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getClassName() {
        return className;
    }

    public TaxonomyClassification className(String className) {
        this.className = className;
        return this;
    }

    public BigInteger getOrdinal() {
        return ordinal;
    }

    public TaxonomyClassification ordinal(BigInteger ordinal) {
        this.ordinal = ordinal;
        return this;
    }

    public String getVal() {
        return val;
    }

    public TaxonomyClassification val(String val) {
        this.val = val;
        return this;
    }

}
