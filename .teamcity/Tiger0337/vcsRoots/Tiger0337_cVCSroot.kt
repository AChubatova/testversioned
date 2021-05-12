package Tiger0337.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Tiger0337_cVCSroot : GitVcsRoot({
    name = "cVCSroot"
    url = "sdfsdf"
    branch = "sdf"
    param("useAlternates", "true")
})
