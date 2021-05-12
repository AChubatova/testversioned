package Tiger0722

import Tiger0722.buildTypes.*
import Tiger0722.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0722")
    name = "Tiger0722"

    vcsRoot(Tiger0722_cVCSroot)

    buildType(Tiger0722_Hi0)
    buildType(Tiger0722_Hi1)
    buildType(Tiger0722_Hi2)
    buildType(Tiger0722_Hi3)
})
