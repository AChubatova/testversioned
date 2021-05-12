package Tiger01332.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

object Tiger01332_cVCSroot : GitVcsRoot({
    name = "cVCSroot"
    url = "sdfsdf"
    branch = "sdf"
    param("useAlternates", "true")
})
