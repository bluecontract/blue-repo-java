package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;
import java.util.List;

@TypeBlueId("EY9iPDd22LwArn4MV9fUHUqkd2gX1guSkAntckHs1xYa")
public class CdmObservableEventPubliclyAvailableInformation {
    public static String blueId() {
        return "EY9iPDd22LwArn4MV9fUHUqkd2gX1guSkAntckHs1xYa";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/event/PubliclyAvailableInformation";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/event/PubliclyAvailableInformation";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableeventPubliclyAvailableInformation.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private List<String> publicSource;

    private BigInteger specifiedNumber;

    private Boolean standardPublicSources;

    public List<String> getPublicSource() {
        return publicSource;
    }

    public CdmObservableEventPubliclyAvailableInformation publicSource(List<String> publicSource) {
        this.publicSource = publicSource;
        return this;
    }

    public BigInteger getSpecifiedNumber() {
        return specifiedNumber;
    }

    public CdmObservableEventPubliclyAvailableInformation specifiedNumber(BigInteger specifiedNumber) {
        this.specifiedNumber = specifiedNumber;
        return this;
    }

    public Boolean getStandardPublicSources() {
        return standardPublicSources;
    }

    public CdmObservableEventPubliclyAvailableInformation standardPublicSources(Boolean standardPublicSources) {
        this.standardPublicSources = standardPublicSources;
        return this;
    }

}
