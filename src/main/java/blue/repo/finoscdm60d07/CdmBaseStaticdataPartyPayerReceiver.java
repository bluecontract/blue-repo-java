package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("JDAXkucJ2m4yHJZmHoTSjW5ZioDKLBu2dbM6gerfoyHn")
public class CdmBaseStaticdataPartyPayerReceiver {
    public static String blueId() {
        return "JDAXkucJ2m4yHJZmHoTSjW5ZioDKLBu2dbM6gerfoyHn";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "cdm/base/staticdata/party/PayerReceiver";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/cdm/base/staticdata/party/PayerReceiver";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/cdmbasestaticdatapartyPayerReceiver.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

    private CdmBaseStaticdataPartyCounterpartyRoleEnum payer;

    private CdmBaseStaticdataPartyCounterpartyRoleEnum receiver;

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getPayer() {
        return payer;
    }

    public CdmBaseStaticdataPartyPayerReceiver payer(CdmBaseStaticdataPartyCounterpartyRoleEnum payer) {
        this.payer = payer;
        return this;
    }

    public CdmBaseStaticdataPartyCounterpartyRoleEnum getReceiver() {
        return receiver;
    }

    public CdmBaseStaticdataPartyPayerReceiver receiver(CdmBaseStaticdataPartyCounterpartyRoleEnum receiver) {
        this.receiver = receiver;
        return this;
    }

}
