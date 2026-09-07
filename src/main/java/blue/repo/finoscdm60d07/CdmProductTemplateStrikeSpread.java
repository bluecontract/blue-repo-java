package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("H6Kj9vAyQTfqy58sMw8DAK6gZ42oanCkDJXYY8QvYPKR")
public class CdmProductTemplateStrikeSpread {
    public static String blueId() {
        return "H6Kj9vAyQTfqy58sMw8DAK6gZ42oanCkDJXYY8QvYPKR";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/template/StrikeSpread";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/template/StrikeSpread";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproducttemplateStrikeSpread.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmProductTemplateOptionStrike upperStrike;

    private Double upperStrikeNumberOfOptions;

    public CdmProductTemplateOptionStrike getUpperStrike() {
        return upperStrike;
    }

    public CdmProductTemplateStrikeSpread upperStrike(CdmProductTemplateOptionStrike upperStrike) {
        this.upperStrike = upperStrike;
        return this;
    }

    public Double getUpperStrikeNumberOfOptions() {
        return upperStrikeNumberOfOptions;
    }

    public CdmProductTemplateStrikeSpread upperStrikeNumberOfOptions(Double upperStrikeNumberOfOptions) {
        this.upperStrikeNumberOfOptions = upperStrikeNumberOfOptions;
        return this;
    }

}
