package blue.repo.v1_3_0.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("AnzvrFn2cEcEcCyVb5Sia8Z4vzkJBrGRh5YMUK7HV7y3")
public class Othr {
    public static String blueId() {
        return "AnzvrFn2cEcEcCyVb5Sia8Z4vzkJBrGRh5YMUK7HV7y3";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Othr";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Othr";
    }

    public static String resourcePath() {
        return "blue/repo/v1_3_0/definitions/FINOS-CDM-6.0-d07/Othr.json";
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

    private DerivInstrmAttrbts derivInstrmAttrbts;

    private FinInstrmGnlAttrbts finInstrmGnlAttrbts;

    private String id;

    private SchmeNm schmeNm;

    public String getNamespace() {
        return namespace;
    }

    public Othr namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DerivInstrmAttrbts getDerivInstrmAttrbts() {
        return derivInstrmAttrbts;
    }

    public Othr derivInstrmAttrbts(DerivInstrmAttrbts derivInstrmAttrbts) {
        this.derivInstrmAttrbts = derivInstrmAttrbts;
        return this;
    }

    public FinInstrmGnlAttrbts getFinInstrmGnlAttrbts() {
        return finInstrmGnlAttrbts;
    }

    public Othr finInstrmGnlAttrbts(FinInstrmGnlAttrbts finInstrmGnlAttrbts) {
        this.finInstrmGnlAttrbts = finInstrmGnlAttrbts;
        return this;
    }

    public String getId() {
        return id;
    }

    public Othr id(String id) {
        this.id = id;
        return this;
    }

    public SchmeNm getSchmeNm() {
        return schmeNm;
    }

    public Othr schmeNm(SchmeNm schmeNm) {
        this.schmeNm = schmeNm;
        return this;
    }

}
