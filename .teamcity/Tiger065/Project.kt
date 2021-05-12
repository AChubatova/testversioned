package Tiger065

import Tiger065.buildTypes.*
import Tiger065.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger065")
    name = "Tiger065"

    vcsRoot(Tiger065_cVCSroot)

    buildType(Tiger065_Hi1)
    buildType(Tiger065_Hi0)
    buildType(Tiger065_Hi3)
    buildType(Tiger065_Hi2)
})
