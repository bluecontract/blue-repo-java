package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("3pgwWM8BYbPbj7MD3oyZLFtR5vuPiv5PRz9YKdSnBWT7")
public class CdmObservableAssetInformationProviderEnum {
    public static String blueId() {
        return "3pgwWM8BYbPbj7MD3oyZLFtR5vuPiv5PRz9YKdSnBWT7";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/observable/asset/InformationProviderEnum";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/observable/asset/InformationProviderEnum";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmobservableassetInformationProviderEnum.json";
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
