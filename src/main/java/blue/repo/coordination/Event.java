package blue.repo.coordination;

import blue.language.model.Node;
import blue.language.model.TypeBlueId;
import blue.repo.RepositoryType;

@TypeBlueId("ENRQ621TbJpLg2cGyYkgTmPRLGKZkPqCzkBgm4yEXKF5")
public class Event {
    public static String blueId() {
        return "ENRQ621TbJpLg2cGyYkgTmPRLGKZkPqCzkBgm4yEXKF5";
    }

    public static String packageName() {
        return "Coordination";
    }

    public static String typeName() {
        return "Event";
    }

    public static String qualifiedName() {
        return "Coordination/Event";
    }

    public static String resourcePath() {
        return "blue/repo/definitions/Coordination/Event.json";
    }

    public static RepositoryType repositoryType() {
        return RepositoryType.of(
                packageName(),
                typeName(),
                qualifiedName(),
                blueId(),
                resourcePath());
    }

}
