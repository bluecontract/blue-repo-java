package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import java.math.BigInteger;

@TypeBlueId("G6wTgdqazh3P4ppaphmfLKqmekudYnsS5TDSKnzhiCYi")
public class CdmProductCollateralSubstitutionProvisions {
    public static String blueId() {
        return "G6wTgdqazh3P4ppaphmfLKqmekudYnsS5TDSKnzhiCYi";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/product/collateral/SubstitutionProvisions";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/product/collateral/SubstitutionProvisions";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmproductcollateralSubstitutionProvisions.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private String noticeDeadlineDateTime;

    private CdmBaseDatetimePeriod noticeDeadlinePeriod;

    private BigInteger numberOfSubstitutionsAllowed;

    public String getNoticeDeadlineDateTime() {
        return noticeDeadlineDateTime;
    }

    public CdmProductCollateralSubstitutionProvisions noticeDeadlineDateTime(String noticeDeadlineDateTime) {
        this.noticeDeadlineDateTime = noticeDeadlineDateTime;
        return this;
    }

    public CdmBaseDatetimePeriod getNoticeDeadlinePeriod() {
        return noticeDeadlinePeriod;
    }

    public CdmProductCollateralSubstitutionProvisions noticeDeadlinePeriod(CdmBaseDatetimePeriod noticeDeadlinePeriod) {
        this.noticeDeadlinePeriod = noticeDeadlinePeriod;
        return this;
    }

    public BigInteger getNumberOfSubstitutionsAllowed() {
        return numberOfSubstitutionsAllowed;
    }

    public CdmProductCollateralSubstitutionProvisions numberOfSubstitutionsAllowed(BigInteger numberOfSubstitutionsAllowed) {
        this.numberOfSubstitutionsAllowed = numberOfSubstitutionsAllowed;
        return this;
    }

}
