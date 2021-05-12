package Tiger01213

import Tiger01213.buildTypes.*
import Tiger01213.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01213")
    name = "Tiger01213"

    vcsRoot(Tiger01213_cVCSroot)

    buildType(Tiger01213_Hi2)
    buildType(Tiger01213_Hi3)
    buildType(Tiger01213_Hi0)
    buildType(Tiger01213_Hi1)
})
