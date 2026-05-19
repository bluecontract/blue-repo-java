package blue.repo.finoscdm60d07;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("7HSaVztR2FCMAamWWvxrWFVfm1jF7BfG5hxsrCabwzJm")
public class Composite {
    public static String blueId() {
        return "7HSaVztR2FCMAamWWvxrWFVfm1jF7BfG5hxsrCabwzJm";
    }

    public static String packageName() {
        return "FINOS-CDM-6.0-d07";
    }

    public static String typeName() {
        return "Composite";
    }

    public static String qualifiedName() {
        return "FINOS-CDM-6.0-d07/Composite";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/FINOS-CDM-6.0-d07/Composite.json";
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

    private DeterminationMethodEnum determinationMethod;

    private BusinessCenterTime fixingTime;

    private FxSpotRateSource fxSpotRateSource;

    private RelativeDateOffset relativeDate;

    public String getNamespace() {
        return namespace;
    }

    public Composite namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    public DeterminationMethodEnum getDeterminationMethod() {
        return determinationMethod;
    }

    public Composite determinationMethod(DeterminationMethodEnum determinationMethod) {
        this.determinationMethod = determinationMethod;
        return this;
    }

    public BusinessCenterTime getFixingTime() {
        return fixingTime;
    }

    public Composite fixingTime(BusinessCenterTime fixingTime) {
        this.fixingTime = fixingTime;
        return this;
    }

    public FxSpotRateSource getFxSpotRateSource() {
        return fxSpotRateSource;
    }

    public Composite fxSpotRateSource(FxSpotRateSource fxSpotRateSource) {
        this.fxSpotRateSource = fxSpotRateSource;
        return this;
    }

    public RelativeDateOffset getRelativeDate() {
        return relativeDate;
    }

    public Composite relativeDate(RelativeDateOffset relativeDate) {
        this.relativeDate = relativeDate;
        return this;
    }

}
