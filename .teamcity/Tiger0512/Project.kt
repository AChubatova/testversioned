package Tiger0512

import Tiger0512.buildTypes.*
import Tiger0512.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0512")
    name = "Tiger0512"

    vcsRoot(Tiger0512_cVCSroot)

    buildType(Tiger0512_Hi3)
    buildType(Tiger0512_Hi1)
    buildType(Tiger0512_Hi2)
    buildType(Tiger0512_Hi0)
})
