# Blue Repository Generator, Tags, and repo.blue Summary

Checked on 2026-05-12.

## Sources Checked

- `blue-js` repository generator: https://github.com/bluecontract/blue-js/tree/main/libs/repository-generator
- `blue-repository` tags: https://github.com/bluecontract/blue-repository/tags
- Conversation install page: https://repo.blue/packages/Conversation/install
- Conversation versions page: https://repo.blue/packages/Conversation/versions
- Local sibling repos:
  - `/Users/piotr/data/blue-js/libs/repository-generator`
  - `/Users/piotr/data/blue-repository`
  - `/Users/piotr/data/blue-repository-java`

## Main Finding

`blue-js/libs/repository-generator` is not primarily a TypeScript model/accessor generator. It is the source repository bundle generator for `BlueRepository.blue`. It scans package folders containing `.blue` and `.dev.blue` files, replaces type aliases with BlueIds, computes type and repository BlueIds, enforces stable/dev versioning rules, and writes or checks the deterministic `BlueRepository.blue` bundle.

That makes it directly relevant to `blue-repository-java`, but as the upstream source-of-truth generator, not as something to copy line-for-line for Java model output.

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

returned 34 repository tags. The tag names are repository BlueIds:

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

The local sibling clone is currently at:

```text
254570b release: sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv
```

but its local tag refs are not complete unless tags are fetched. Any automation should enumerate remote tags or maintain a controlled tag cache rather than trusting the existing local clone's tag list.

## repo.blue Conversation Version Check

Live `repo.blue` fetches on 2026-05-12 show the current Conversation package as `v1.2.0`.

The install page uses the unified generated JS package:

```bash
npm install @blue-repository/types@1.2.0
yarn add @blue-repository/types@1.2.0
pnpm add @blue-repository/types@1.2.0
```

The versions page currently exposes these Conversation package revisions:

| SDK version | Repository BlueId | Present as Git tag |
| --- | --- | --- |
| `1.2.0` | `sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv` | yes |
| `1.1.0` | `B4qWEbNWRcgabYrDTxtebfRSP5nBnEYvpX5YWqa2PcE4` | yes |
| `1.0.0` | `5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij` | yes |

The live `BlueRepository.blue` in the local sibling repo also has:

```yaml
repositoryVersions:
  - 5gmX9Fhnu4qM9ZJuqKAVZQXCQng3h4hZbWoaSEufSzij
  - B4qWEbNWRcgabYrDTxtebfRSP5nBnEYvpX5YWqa2PcE4
  - sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv
```

Some indexed/search views and text browser snapshots showed stale older Conversation versions such as `0.6.0`, `0.24.0`, `0.25.0`, and `0.30.0`. The live Next-rendered HTML is the better source for current package/version data.

## Installed JS SDK Shape

The Conversation install page points consumers to the unified package:

```bash
npm install @blue-repository/types@1.2.0
```

The published package metadata for `@blue-repository/types@1.2.0` declares:

- package repository: `https://github.com/bluecontract/blue-repository-js`;
- peer dependencies: `@blue-labs/language` and `zod`;
- `blueType.moduleName`: `Blue Repository`;
- `blueType.moduleBlueId`: `sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv`;
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

## Implications For blue-repository-java

The Java project already has the right generated companion shape: classpath resources, generated Java models, constants, manifests, and repository provider/facade APIs. The gap is version sourcing.

Current generator behavior in `/Users/piotr/data/blue-repository-java/tools/generate-repository-sources.js` after the latest-version correction:

- defaults to `repositoryVersion = '1.2.0'`;
- defaults Java package/resource paths under `v1_2_0`;
- accepts `--source`, `--repository-version`, `--java-package-segment`, `--resource-base`, and `--java-package` overrides;
- still reads a moving source file from `../blue-repository/BlueRepository.blue` by default;
- records the current repository BlueId from that moving source bundle.

This fixes the previous public-version mismatch for the current checked manifest:

```json
{
  "repositoryVersion": "1.2.0",
  "repositoryVersionBlueId": "sUk1iHFrf7UQXAMeQvWRyvYVxxStUjfARaE5e4EgDKv"
}
```

The remaining gap is source acquisition. The default source path is still a local checkout; the next step is to fetch the exact tag snapshot into `build/` from the checked-in version catalog.

The Java generator should be changed to consume explicit repository tags and explicit version metadata. It should not read a moving sibling `main` checkout unless the task is intentionally "generate from local working tree".

The current generated manifest preserves the three `repositoryVersions` entries present in the latest `BlueRepository.blue` bundle and labels them `1.0.0`, `1.1.0`, and `1.2.0`. That is separate from the larger public Git tag history, which currently has 34 repository BlueId tags. See `docs/repository-tag-numbering.md` for the ordered tag inventory.

## Practical Conclusion

Use `blue-repository` Git tags as the canonical immutable source snapshots. Use repo.blue package/version pages to map public SDK versions, especially the current `@blue-repository/types` version, to repository BlueId tags. Keep the exact repository BlueId in every generated manifest and facade so Java code can always prove which repository snapshot it exposes.
