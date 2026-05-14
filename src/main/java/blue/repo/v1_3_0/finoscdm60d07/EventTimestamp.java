package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("FGY4T85sJV5uNzmuYPfAAerjSoVbrDPjaCBHmc8Pa6H4")
public class EventTimestamp {
    public static String blueId() {
        return "FGY4T85sJV5uNzmuYPfAAerjSoVbrDPjaCBHmc8Pa6H4";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "EventTimestamp";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/EventTimestamp";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/EventTimestamp.json";
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

    private String dateTime;

    private EventTimestampQualificationEnum qualification;

    public String getNamespace() {
        return namespace;
    }

    public EventTimestamp namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getDateTime() {
        return dateTime;
    }

    public EventTimestamp dateTime(String dateTime) {
        this.dateTime = dateTime;
        return this;
    }

    public EventTimestampQualificationEnum getQualification() {
        return qualification;
    }

    public EventTimestamp qualification(EventTimestampQualificationEnum qualification) {
        this.qualification = qualification;
        return this;
    }

}
