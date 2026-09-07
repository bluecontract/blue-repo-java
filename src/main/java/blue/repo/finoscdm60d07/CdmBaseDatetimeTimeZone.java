package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("4S8rv6TtcS3Xv2uxWB136mrQZVM76NTdkyKBGTgn5Z7N")
public class CdmBaseDatetimeTimeZone {
    public static String blueId() {
        return "4S8rv6TtcS3Xv2uxWB136mrQZVM76NTdkyKBGTgn5Z7N";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/datetime/TimeZone";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/datetime/TimeZone";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasedatetimeTimeZone.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private ComRosettaModelFieldWithMetaString location;

    private String time;

    public ComRosettaModelFieldWithMetaString getLocation() {
        return location;
    }

    public CdmBaseDatetimeTimeZone location(ComRosettaModelFieldWithMetaString location) {
        this.location = location;
        return this;
    }

    public String getTime() {
        return time;
    }

    public CdmBaseDatetimeTimeZone time(String time) {
        this.time = time;
        return this;
    }

}
