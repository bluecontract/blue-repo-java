package blue.repository;

import blue.language.model.Node;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public final class RepositoryDefinition {
    private final String packageName;
    private final String name;
    private final String qualifiedName;
    private final String blueId;
    private final String resourcePath;
    private final String status;
    private final int repositoryVersionIndex;
    private final List<RepositoryTypeVersion> versions;

    public RepositoryDefinition(String packageName,
                                String name,
                                String qualifiedName,
                                String blueId,
                                String resourcePath,
                                String status,
                                int repositoryVersionIndex,
                                List<RepositoryTypeVersion> versions) {
        this.packageName = require(packageName, "packageName");
        this.name = require(name, "name");
        this.qualifiedName = require(qualifiedName, "qualifiedName");
        this.blueId = require(blueId, "blueId");
        this.resourcePath = require(resourcePath, "resourcePath");
        this.status = status;
        this.repositoryVersionIndex = repositoryVersionIndex;
        List<RepositoryTypeVersion> normalized = new ArrayList<>();
        if (versions != null) {
            normalized.addAll(versions);
        }
        if (normalized.isEmpty()) {
            normalized.add(new RepositoryTypeVersion(repositoryVersionIndex, blueId, Collections.<String>emptyList(), true));
        }
        normalized.sort(Comparator.comparingInt(RepositoryTypeVersion::repositoryVersionIndex));
        this.versions = Collections.unmodifiableList(normalized);
    }

    public String packageName() {
        return packageName;
    }

    public String name() {
        return name;
    }

    public String qualifiedName() {
        return qualifiedName;
    }

    public String blueId() {
        return blueId;
    }

    public String resourcePath() {
        return resourcePath;
    }

    public String status() {
        return status;
    }

    public int repositoryVersionIndex() {
        return repositoryVersionIndex;
    }

    public List<RepositoryTypeVersion> versions() {
        return versions;
    }

    public Optional<RepositoryTypeVersion> versionAtOrBefore(int repositoryVersionIndex) {
        RepositoryTypeVersion match = null;
        for (RepositoryTypeVersion version : versions) {
            if (version.repositoryVersionIndex() <= repositoryVersionIndex) {
                match = version;
            }
        }
        return Optional.ofNullable(match);
    }

    public Optional<RepositoryTypeVersion> versionForRepositoryIndex(int repositoryVersionIndex) {
        for (RepositoryTypeVersion version : versions) {
            if (version.repositoryVersionIndex() == repositoryVersionIndex) {
                return Optional.of(version);
            }
        }
        return Optional.empty();
    }

    public RepositoryType type() {
        return RepositoryType.of(packageName, name, qualifiedName, blueId, resourcePath);
    }

    public Node reference() {
        return new Node().blueId(blueId);
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepositoryDefinition)) {
            return false;
        }
        RepositoryDefinition that = (RepositoryDefinition) other;
        return repositoryVersionIndex == that.repositoryVersionIndex
                && Objects.equals(packageName, that.packageName)
                && Objects.equals(name, that.name)
                && Objects.equals(qualifiedName, that.qualifiedName)
                && Objects.equals(blueId, that.blueId)
                && Objects.equals(resourcePath, that.resourcePath)
                && Objects.equals(status, that.status)
                && Objects.equals(versions, that.versions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(packageName, name, qualifiedName, blueId, resourcePath, status, repositoryVersionIndex, versions);
    }

    @Override
    public String toString() {
        return qualifiedName + " (" + blueId + ")";
    }

    private static String require(String value, String field) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(field + " must not be empty");
        }
        return value;
    }
}
