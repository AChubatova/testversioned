package Tiger01439

import Tiger01439.buildTypes.*
import Tiger01439.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger01439")
    name = "Tiger01439"

    vcsRoot(Tiger01439_cVCSroot)

    buildType(Tiger01439_Hi3)
    buildType(Tiger01439_Hi2)
    buildType(Tiger01439_Hi1)
    buildType(Tiger01439_Hi0)
})
