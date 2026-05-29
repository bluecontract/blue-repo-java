package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("EoDMqHigbcwPNKwviyKGVKGLRzRNcHCgewYAa7WXh4tS")
public class CdmProductCommonScheduleInitialFixingDate {
    public static String blueId() {
        return "EoDMqHigbcwPNKwviyKGVKGLRzRNcHCgewYAa7WXh4tS";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/common/schedule/InitialFixingDate";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/common/schedule/InitialFixingDate";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcommonscheduleInitialFixingDate.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String initialFixingDate;

    private CdmBaseDatetimeRelativeDateOffset relativeDateOffset;

    public String getInitialFixingDate() {
        return initialFixingDate;
    }

    public CdmProductCommonScheduleInitialFixingDate initialFixingDate(String initialFixingDate) {
        this.initialFixingDate = initialFixingDate;
        return this;
    }

    public CdmBaseDatetimeRelativeDateOffset getRelativeDateOffset() {
        return relativeDateOffset;
    }

    public CdmProductCommonScheduleInitialFixingDate relativeDateOffset(CdmBaseDatetimeRelativeDateOffset relativeDateOffset) {
        this.relativeDateOffset = relativeDateOffset;
        return this;
    }

}
