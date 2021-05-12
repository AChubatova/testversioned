package Tiger0949

import Tiger0949.buildTypes.*
import Tiger0949.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0949")
    name = "Tiger0949"

    vcsRoot(Tiger0949_cVCSroot)

    buildType(Tiger0949_Hi0)
    buildType(Tiger0949_Hi2)
    buildType(Tiger0949_Hi1)
    buildType(Tiger0949_Hi3)
})
