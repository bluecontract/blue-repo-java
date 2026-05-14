package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.util.List;

@TypeBlueId("G9xZtW7BqNbfHAoLoUCyH688AphHKetSSfE4tuSNok6")
public class DistributionAndInterestPayment {
    public static String blueId() {
        return "G9xZtW7BqNbfHAoLoUCyH688AphHKetSSfE4tuSNok6";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "DistributionAndInterestPayment";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/DistributionAndInterestPayment";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/DistributionAndInterestPayment.json";
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

    private List<CollateralInterestParameters> interestParameters;

    public String getNamespace() {
        return namespace;
    }

    public DistributionAndInterestPayment namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public List<CollateralInterestParameters> getInterestParameters() {
        return interestParameters;
    }

    public DistributionAndInterestPayment interestParameters(List<CollateralInterestParameters> interestParameters) {
        this.interestParameters = interestParameters;
        return this;
    }

}
