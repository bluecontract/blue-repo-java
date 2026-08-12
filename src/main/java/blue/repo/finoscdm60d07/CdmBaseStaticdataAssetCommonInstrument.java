package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;
import com.fasterxml.jackson.annotation.JsonProperty;

@TypeBlueId("C1eJzacRV3YdWTiLScoqLS2Uv4KC4MEWVfb1ux4P9CeV")
public class CdmBaseStaticdataAssetCommonInstrument {
    public static String blueId() {
        return "C1eJzacRV3YdWTiLScoqLS2Uv4KC4MEWVfb1ux4P9CeV";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/asset/common/Instrument";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/asset/common/Instrument";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdataassetcommonInstrument.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    // Original Blue property name: ListedDerivative
    @JsonProperty("ListedDerivative")
    private CdmBaseStaticdataAssetCommonListedDerivative listedDerivative;

    // Original Blue property name: Loan
    @JsonProperty("Loan")
    private CdmBaseStaticdataAssetCommonLoan loan;

    // Original Blue property name: Security
    @JsonProperty("Security")
    private CdmBaseStaticdataAssetCommonSecurity security;

    public CdmBaseStaticdataAssetCommonListedDerivative getListedDerivative() {
        return listedDerivative;
    }

    public CdmBaseStaticdataAssetCommonInstrument listedDerivative(CdmBaseStaticdataAssetCommonListedDerivative listedDerivative) {
        this.listedDerivative = listedDerivative;
        return this;
    }

    public CdmBaseStaticdataAssetCommonLoan getLoan() {
        return loan;
    }

    public CdmBaseStaticdataAssetCommonInstrument loan(CdmBaseStaticdataAssetCommonLoan loan) {
        this.loan = loan;
        return this;
    }

    public CdmBaseStaticdataAssetCommonSecurity getSecurity() {
        return security;
    }

    public CdmBaseStaticdataAssetCommonInstrument security(CdmBaseStaticdataAssetCommonSecurity security) {
        this.security = security;
        return this;
    }

}
