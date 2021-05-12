package Tiger0947

import Tiger0947.buildTypes.*
import Tiger0947.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0947")
    name = "Tiger0947"

    vcsRoot(Tiger0947_cVCSroot)

    buildType(Tiger0947_Hi1)
    buildType(Tiger0947_Hi2)
    buildType(Tiger0947_Hi3)
    buildType(Tiger0947_Hi0)
})
