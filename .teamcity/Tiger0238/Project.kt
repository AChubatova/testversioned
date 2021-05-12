package Tiger0238

import Tiger0238.buildTypes.*
import Tiger0238.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0238")
    name = "Tiger0238"

    vcsRoot(Tiger0238_cVCSroot)

    buildType(Tiger0238_Hi2)
    buildType(Tiger0238_Hi3)
    buildType(Tiger0238_Hi0)
    buildType(Tiger0238_Hi1)
})
