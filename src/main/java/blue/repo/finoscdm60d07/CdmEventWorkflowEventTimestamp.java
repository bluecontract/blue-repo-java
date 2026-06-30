package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("DSJDCMX9fWnAZqseXHzuc3NWEvtct9Ay1D8XqV7Cz8sb")
public class CdmEventWorkflowEventTimestamp {
    public static String blueId() {
        return "DSJDCMX9fWnAZqseXHzuc3NWEvtct9Ay1D8XqV7Cz8sb";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/event/workflow/EventTimestamp";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/event/workflow/EventTimestamp";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmeventworkflowEventTimestamp.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String dateTime;

    private CdmEventWorkflowEventTimestampQualificationEnum qualification;

    public String getDateTime() {
        return dateTime;
    }

    public CdmEventWorkflowEventTimestamp dateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public CdmEventWorkflowEventTimestampQualificationEnum getQualification() {
        return qualification;
    }

    public CdmEventWorkflowEventTimestamp qualification(CdmEventWorkflowEventTimestampQualificationEnum qualification) {
        this.qualification = qualification;
        return this;
    }

}
