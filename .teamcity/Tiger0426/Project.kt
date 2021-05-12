package Tiger0426

import Tiger0426.buildTypes.*
import Tiger0426.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0426")
    name = "Tiger0426"

    vcsRoot(Tiger0426_cVCSroot)

    buildType(Tiger0426_Hi0)
    buildType(Tiger0426_Hi2)
    buildType(Tiger0426_Hi1)
    buildType(Tiger0426_Hi3)
})
