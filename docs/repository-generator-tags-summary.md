# Blue Repository Generator, Tags, and repo.blue Summary

Checked on 2026-05-12. Updated on 2026-05-20 after the generated Java API moved to stable `blue.repo.*` packages.

Current checked-in generation uses the local sibling `../blue-repository/BlueRepository.blue`. Its latest repository-version BlueId is `ApBvKPTrXaHj627c3SHErc7FwpxTN5kLX1Y3frvRyoYg`, and the generated Java packages are stable (`blue.repo.conversation`, `blue.repo.core`, etc.) rather than versioned (`blue.repo.v...`). Older notes below describe the tag/version investigation that led to this setup.

## Sources Checked

- `blue-js` repository generator: https://github.com/bluecontract/blue-js/tree/main/libs/repository-generator
- `blue-repository` tags: https://github.com/bluecontract/blue-repository/tags
- Conversation install page: https://repo.blue/packages/Conversation/install
- Conversation versions page: https://repo.blue/packages/Conversation/versions
- Local sibling repos:
  - `/Users/piotr/data/blue-js/libs/repository-generator`
  - `/Users/piotr/data/blue-repository`
  - `/Users/piotr/data/blue-repo-java`

## Main Finding

`blue-js/libs/repository-generator` is not primarily a TypeScript model/accessor generator. It is the source repository bundle generator for `BlueRepository.blue`. It scans package folders containing `.blue` and `.dev.blue` files, replaces type aliases with BlueIds, computes type and repository BlueIds, enforces stable/dev versioning rules, and writes or checks the deterministic `BlueRepository.blue` bundle.

That makes it directly relevant to `blue-repo-java`, but as the upstream source-of-truth generator, not as something to copy line-for-line for Java model output.

## 2026-05-14 Repository Update

The current upstream `BlueRepository.blue` is now the bundle tagged:

```text
EoCY8mgNhP1aniwnSFs9UX74tYDu35zL5LUZNJxf8vqz
```

The generated Java package maps this repository bundle to Java artifact/package
version `1.3.0` and package segment `blue.repo`.

Current generated bundle facts:

| Field | Value |
| --- | --- |
| Repository version index | `3` |
| Repository BlueId | `EoCY8mgNhP1aniwnSFs9UX74tYDu35zL5LUZNJxf8vqz` |
| Repository versions in bundle | `4` |
| Generated definitions | `1136` |
| Packages | `Common`, `Conversation`, `Core`, `FINOS-CDM-6.0-d07`, `MyOS`, `PayNote` |

The previously generated bundle was repository version index `2`, BlueId
`sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv`, mapped to Java/catalog version
`1.2.0`.

## How the JS Repository Generator Works

The CLI entry point is `src/bin/blue-repo-generator.ts`.

Supported options:

```bash
blue-repo-generator \
  --repo-root <path-to-packages-root> \
  --blue-repository <output-file> \
  --mode check|write \
  [--verbose] [--json] [--allow-diff]
```

The programmatic entry point is `generateRepository(...)` in `src/lib/generateRepository.ts`.

Pipeline:

1. Read existing `BlueRepository.blue`, if present.
2. Discover package folders under `repoRoot`.
3. Treat `.blue` files as stable definitions and `.dev.blue` files as dev definitions.
4. Parse Blue YAML through `yamlBlueParse`.
5. Extract aliases as `<Package>/<Type>` from each definition.
6. Collect references from `type`, `itemType`, `keyType`, and `valueType`.
7. Reject malformed non-primitive references that are not qualified aliases.
8. Build a dependency graph and topologically sort it.
9. Reject cycles and unknown references.
10. Enforce that stable types cannot depend on dev types.
11. Substitute primitive and repository aliases with BlueId references before hashing.
12. Normalize values into the canonical Blue shape used for BlueId calculation.
13. Calculate each type BlueId with `BlueIdCalculator`.
14. Build package/type version metadata from the previous `BlueRepository.blue`.
15. Reject removal of stable types.
16. Reject stable-to-dev downgrades.
17. Reject breaking changes to stable types.
18. Allow non-breaking stable additions by appending a type version with `attributesAdded`.
19. Treat dev types as one current version, preserving the old dev BlueId only when unchanged.
20. Sort packages, types, and versions deterministically.
21. Compute the repository BlueId over the package subtree.
22. Append the repository BlueId to `repositoryVersions` when the repository changed.
23. Validate with `@blue-labs/repository-contract`.
24. Serialize deterministic YAML.

Important invariants:

- `BlueRepository.blue` is generated deterministically.
- The repository BlueId covers the `packages` subtree.
- Primitive BlueIds come from `blue-language` core type metadata.
- Stable type changes are guarded by structural diffing.
- Stable definitions are not allowed to reference dev definitions.
- Contract validation runs after generation to catch repository-level consistency problems.

## Remote Tag Inventory

The public GitHub tags page is paginated and the unauthenticated text view only showed part of the tag list. A direct remote tag check with:

```bash
git ls-remote --refs --tags https://github.com/bluecontract/blue-repository.git
```

returned 35 repository tags after the 2026-05-14 update. The tag names are repository BlueIds:

```text
22xxEjtpjUSpttaRiHX5XbmGNcFhpgLipai685YMdMWv
2X96EiMnmws7kmgtS3bgGm38NHGBwXeViAxmGqkxyiDT
2iUtnWCNhsh5arVZxx7Xum4D8PM2NWBAbJ4XoaEfr4Kc
2m6QjrS7SGeuhqufTcuunxLCpHmrqykEFXZcqSyU6wUc
4vpHZQ2NpENzjNmaR9TDBrezwZ392BJH9t31bZBaeRRr
58apGqo2EExaKTQQJmjASbj8p7tHvrWkoQVjWeWzaox5
5C7dGdtZGYPee4HtCXqFF4XpRuhhXeuaiWNDpdcG2iie
5FLaqPWQ7FJF5DFyCy1H4Ry9SHvX2ByfLbgJ2U3QTqUx
5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij
7x5HXkJCQPefxeQkAAC25hBM6x5XhDuoxNT618y9LWoV
86We3PQVRxhQak3PKXAKhDSZXukMTpyMTM8PEettEENw
8woWtWYyJxmzPJhAv5SptmZJsyXAq2Q2ckF4jtwDQJPE
96W8M1cHNU9Vo7UGbFmiCXqQrNovqEK1WuADFmd9Nnko
9HWPEq8AoXuWtmsqgbxYqFqpuizJg1RdXmfEQA1qhsbi
9RQUZnXwdjk6YqSamBbaX5ZpDPBcHJeFsPF2rM7zncyu
9g7Gnfrq1c8koa8Fkngs8J9V7oKzMhuXQ7JGfpUfdQGp
AGDPTwMdekjTE775U5Dc4WTjZPN46D14ohKsb6hUZkVp
Aig1A2dxJCJkXPYQLyPSXhXJUdBDULKq2cFVv1mv2Uvg
B4qWEbNWRcgabYrDTxtebfRSP5nBnEYvpX5YWqa2PcE4
C6oygUcsKjgqmSej2DMZkuDMqT7frfFL3t11gHGMFebY
CQn9FCus2xkhgCdSZQqKQmKGRLKnqTboSyiJXn3pya68
EQTRE5bBZZb7P6GB6r3p9scPTTgwbR1SHFhYePo3ji4x
EbEJF1ttddLLVTPtGjxo8TnjxdZsQvtfmanjgUheQuvp
EoCY8mgNhP1aniwnSFs9UX74tYDu35zL5LUZNJxf8vqz
EpCTtQtiyxppoVxqFbVZLiV7684165ENL3M2qwJigMFP
EpNsiwie3wUf5Hqeo9fdiycvemBQm681hXEaWPEKNAuF
FLEAJh7wxmniwWikxfZmDDZvHKjBKuNQeBbQUbBqdJ7E
GenpwaWZPgCUuDBd8DDAa5Kes2ojV1oP4eVt6ayBKy6e
GzGCVkWasHpGFUWBvG71avwWvGWHeEdCPoMdKy47cTMe
HJT4uiGF9qWmZSgdZ3oChgRXkKaFzmrZHqwuNPoRCDpG
J41s13bymFExtPh8YmYrRdQECGKomDfB8djpj8uUNkHy
J7UTMwNkrjuBVtnB1AmtgCwgkNdQuuBotNoQbxanAJBw
fWQgpx2U9V1wz6MqurHqeYfAbWxHP6ym1hsJfSb6aqt
sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv
vb22qGkPkict5EnAXzF9oyoEGBW6PYxucfAFeegBb6G
```

The older local sibling clone was previously at:

```text
254570b release: sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv
```

but its local tag refs are not complete unless tags are fetched. Any automation should enumerate remote tags or maintain a controlled tag cache rather than trusting the existing local clone's tag list.

## repo.blue Conversation Version Check

Live `repo.blue` and the upstream `BlueRepository.blue` now expose repository
version index `3` as current. At the time of the Java refresh, the JS package
repository still lagged this new bundle, so Java uses the repository version
catalog from `BlueRepository.blue` directly.

The versions page exposes these repository revisions:

| SDK version | Repository BlueId | Present as Git tag |
| --- | --- | --- |
| Java `1.3.0` / repository index `3` | `EoCY8mgNhP1aniwnSFs9UX74tYDu35zL5LUZNJxf8vqz` | yes |
| `1.2.0` | `sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv` | yes |
| `1.1.0` | `B4qWEbNWRcgabYrDTxtebfRSP5nBnEYvpX5YWqa2PcE4` | yes |
| `1.0.0` | `5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij` | yes |

The live `BlueRepository.blue` in the local sibling repo also has:

```yaml
repositoryVersions:
  - 5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij
  - B4qWEbNWRcgabYrDTxtebfRSP5nBnEYvpX5YWqa2PcE4
  - sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv
  - EoCY8mgNhP1aniwnSFs9UX74tYDu35zL5LUZNJxf8vqz
```

Some indexed/search views and text browser snapshots showed stale older Conversation versions such as `0.6.0`, `0.24.0`, `0.25.0`, and `0.30.0`. The live Next-rendered HTML is the better source for current package/version data.

## Installed JS SDK Shape

At the time of this refresh, the `blue-repository-js` clone and npm metadata
were still behind the new repository bundle. Treat JS package metadata as a
consumer SDK signal, not as the source of truth for Java generation, until it
contains repository BlueId `EoCY8mgNhP1aniwnSFs9UX74tYDu35zL5LUZNJxf8vqz`.

The latest checked JS package shape points consumers to the unified package:

```bash
npm install @blue-repository/types
```

The published package metadata declares:

- package repository: `https://github.com/bluecontract/blue-repository-js`;
- peer dependencies: `@blue-labs/language` and `zod`;
- `blueType.moduleName`: `Blue Repository`;
- `blueType.moduleBlueId`: the repository BlueId packaged by that JS release;
- exports for root metadata, repository data, packages, per-package metadata, per-package BlueIds, contents, and schemas.

The generated JS package layout is:

```text
dist/
  index.js
  meta.js
  repository.js
  type-aliases.js
  packages/
    common/
    conversation/
    core/
    myos/
    paynote/
```

Each package directory contains:

- `blue-ids.js`: qualified alias to current type BlueId map;
- `contents/*.js`: raw type definition objects;
- `schemas/*.js`: Zod schemas decorated with `withTypeBlueId(currentBlueId)`;
- `meta.js`: package metadata with aliases and per-type version history.

Root `meta.js` contains repository version history:

```js
export const repositoryVersions = [
  '5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij',
  'B4qWEbNWRcgabYrDTxtebfRSP5nBnEYvpX5YWqa2PcE4',
  'sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv',
  'EoCY8mgNhP1aniwnSFs9UX74tYDu35zL5LUZNJxf8vqz',
];
```

Per-package `meta.js` is the important model for Java to follow. It keys `typesMeta` by the current type BlueId and stores:

```js
{
  status: 'stable' | 'dev',
  name: 'Type Name',
  versions: [
    {
      repositoryVersionIndex: 0,
      typeBlueId: '...',
      attributesAdded: [],
    },
  ],
}
```

So the JS SDK does not put old type BlueIds into the Zod schema decorator. It decorates schemas with the current type BlueId and keeps prior type BlueIds in metadata version history.

The root `type-aliases.js` also builds a reverse BlueId-to-alias map across primitive and repository types.

## Implications For blue-repo-java

The Java project already has the right generated companion shape: classpath resources, generated Java models, constants, manifests, and repository provider/facade APIs. The gap is version sourcing.

Current generator behavior in `/Users/piotr/data/blue-repo-java/tools/generate-repository-sources.js` after the latest-version correction:

- defaults to `repositoryVersion = '1.3.0'`;
- defaults Java package/resource paths under stable `blue.repo` / `blue/repo`;
- accepts `--source`, `--repository-version`, `--java-package-segment`, `--resource-base`, and `--java-package` overrides;
- reads the checked-in current `BlueRepository.blue` by default, or an explicit `--source` / `-PblueRepositorySource=...` when refreshing from upstream;
- records the current repository BlueId from the selected source bundle.

This fixes the previous public-version mismatch for the current checked manifest:

```json
{
  "repositoryVersion": "1.3.0",
  "repositoryVersionBlueId": "ApBvKPTrXaHj627c3SHErc7FwpxTN5kLX1Y3frvRyoYg"
}
```

The remaining gap is source acquisition. The default source path is still a local checkout; the next step is to fetch the exact tag snapshot into `build/` from the checked-in version catalog.

The Java generator should be changed to consume explicit repository tags and explicit version metadata. It should not read a moving sibling `main` checkout unless the task is intentionally "generate from local working tree".

The current generated manifest preserves the `repositoryVersions` entries present in the latest `BlueRepository.blue` bundle. The newest entry is exposed as the artifact's public repository version, while older entries remain available as dictionary BlueIds for export compatibility. That is separate from the larger public Git tag history; see `docs/repository-tag-numbering.md` for the ordered tag inventory.

## Practical Conclusion

Use `blue-repository` Git tags as the canonical immutable source snapshots. Use repo.blue package/version pages to map public SDK versions, especially the current `@blue-repository/types` version, to repository BlueId tags. Keep the exact repository BlueId in every generated manifest and facade so Java code can always prove which repository snapshot it exposes.
