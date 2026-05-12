package blue.repository;

import java.util.Objects;

public final class RepositoryVersion {
    private final int index;
    private final String version;
    private final String repositoryBlueId;

    public RepositoryVersion(int index, String version, String repositoryBlueId) {
        if (index < 0) {
            throw new IllegalArgumentException("index must not be negative");
        }
        this.index = index;
        this.version = require(version, "version");
        this.repositoryBlueId = require(repositoryBlueId, "repositoryBlueId");
    }

    public int index() {
        return index;
    }

    public String version() {
        return version;
    }

    public String repositoryBlueId() {
        return repositoryBlueId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RepositoryVersion)) {
            return false;
        }
        RepositoryVersion that = (RepositoryVersion) other;
        return index == that.index
                && Objects.equals(version, that.version)
                && Objects.equals(repositoryBlueId, that.repositoryBlueId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, version, repositoryBlueId);
    }

    @Override
    public String toString() {
        return version + " (" + repositoryBlueId + ")";
    }

    private static String require(String value, String field) {
        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException(field + " must not be empty");
        }
        return value;
    }
}
