package Tiger0940

import Tiger0940.buildTypes.*
import Tiger0940.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0940")
    name = "Tiger0940"

    vcsRoot(Tiger0940_cVCSroot)

    buildType(Tiger0940_Hi2)
    buildType(Tiger0940_Hi3)
    buildType(Tiger0940_Hi0)
    buildType(Tiger0940_Hi1)
})
