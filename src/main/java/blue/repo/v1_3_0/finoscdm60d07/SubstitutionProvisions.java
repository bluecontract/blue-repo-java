package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("C1LEMTt1iuPcDQrv44JKMTs6ZshZHpQ4dkDP1dhh6qRi")
public class SubstitutionProvisions {
    public static String blueId() {
        return "C1LEMTt1iuPcDQrv44JKMTs6ZshZHpQ4dkDP1dhh6qRi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "SubstitutionProvisions";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/SubstitutionProvisions";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/SubstitutionProvisions.json";
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

    private String noticeDeadlineDateTime;

    private Period noticeDeadlinePeriod;

    private BigInteger numberOfSubstitutionsAllowed;

    public String getNamespace() {
        return namespace;
    }

    public SubstitutionProvisions namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public String getNoticeDeadlineDateTime() {
        return noticeDeadlineDateTime;
    }

    public SubstitutionProvisions noticeDeadlineDateTime(String noticeDeadlineDateTime) {
        this.noticeDeadlineDateTime = noticeDeadlineDateTime;
        return this;
    }

    public Period getNoticeDeadlinePeriod() {
        return noticeDeadlinePeriod;
    }

    public SubstitutionProvisions noticeDeadlinePeriod(Period noticeDeadlinePeriod) {
        this.noticeDeadlinePeriod = noticeDeadlinePeriod;
        return this;
    }

    public BigInteger getNumberOfSubstitutionsAllowed() {
        return numberOfSubstitutionsAllowed;
    }

    public SubstitutionProvisions numberOfSubstitutionsAllowed(BigInteger numberOfSubstitutionsAllowed) {
        this.numberOfSubstitutionsAllowed = numberOfSubstitutionsAllowed;
        return this;
    }

}
