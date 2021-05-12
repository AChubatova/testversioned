package Tiger0027

import Tiger0027.buildTypes.*
import Tiger0027.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0027")
    name = "Tiger0027"

    vcsRoot(Tiger0027_cVCSroot)

    buildType(Tiger0027_Hi3)
    buildType(Tiger0027_Hi2)
    buildType(Tiger0027_Hi1)
    buildType(Tiger0027_Hi0)
})
