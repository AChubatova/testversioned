package Tiger0159.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Tiger0159_cVCSroot : GitVcsRoot({
    name = "cVCSroot"
    url = "sdfsdf"
    branch = "sdf"
    param("useAlternates", "true")
})
