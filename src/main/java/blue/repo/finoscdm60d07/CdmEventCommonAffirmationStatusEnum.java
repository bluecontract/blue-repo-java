package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FrB9uGyYD4L5TjaEcsV3duuewzsGfwpGrdEK2E66mNpT")
public class CdmEventCommonAffirmationStatusEnum {
    public static String blueId() {
        return "FrB9uGyYD4L5TjaEcsV3duuewzsGfwpGrdEK2E66mNpT";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/common/AffirmationStatusEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/common/AffirmationStatusEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventcommonAffirmationStatusEnum.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
