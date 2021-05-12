package Tiger0517

import Tiger0517.buildTypes.*
import Tiger0517.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0517")
    name = "Tiger0517"

    vcsRoot(Tiger0517_cVCSroot)

    buildType(Tiger0517_Hi3)
    buildType(Tiger0517_Hi2)
    buildType(Tiger0517_Hi1)
    buildType(Tiger0517_Hi0)
})
