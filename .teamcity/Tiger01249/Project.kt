package Tiger01249

import Tiger01249.buildTypes.*
import Tiger01249.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01249")
    name = "Tiger01249"

    vcsRoot(Tiger01249_cVCSroot)

    buildType(Tiger01249_Hi2)
    buildType(Tiger01249_Hi1)
    buildType(Tiger01249_Hi3)
    buildType(Tiger01249_Hi0)
})
