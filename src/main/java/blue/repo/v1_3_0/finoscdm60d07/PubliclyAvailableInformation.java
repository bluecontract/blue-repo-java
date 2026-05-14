package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("HdbDzRVvcxQ8K5mCWazocnDMiy2KFUe5zJLbzfGd85nY")
public class PubliclyAvailableInformation {
    public static String blueId() {
        return "HdbDzRVvcxQ8K5mCWazocnDMiy2KFUe5zJLbzfGd85nY";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "PubliclyAvailableInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/PubliclyAvailableInformation";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/PubliclyAvailableInformation.json";
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

    private List<String> publicSource;

    private BigInteger specifiedNumber;

    private Boolean standardPublicSources;

    public String getNamespace() {
        return namespace;
    }

    public PubliclyAvailableInformation namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<String> getPublicSource() {
        return publicSource;
    }

    public PubliclyAvailableInformation publicSource(List<String> publicSource) {
        this.publicSource = publicSource;
        return this;
    }

    public BigInteger getSpecifiedNumber() {
        return specifiedNumber;
    }

    public PubliclyAvailableInformation specifiedNumber(BigInteger specifiedNumber) {
        this.specifiedNumber = specifiedNumber;
        return this;
    }

    public Boolean getStandardPublicSources() {
        return standardPublicSources;
    }

    public PubliclyAvailableInformation standardPublicSources(Boolean standardPublicSources) {
        this.standardPublicSources = standardPublicSources;
        return this;
    }

}
