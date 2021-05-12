package Tiger0944

import Tiger0944.buildTypes.*
import Tiger0944.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0944")
    name = "Tiger0944"

    vcsRoot(Tiger0944_cVCSroot)

    buildType(Tiger0944_Hi2)
    buildType(Tiger0944_Hi3)
    buildType(Tiger0944_Hi0)
    buildType(Tiger0944_Hi1)
})
