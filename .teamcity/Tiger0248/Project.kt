package Tiger0248

import Tiger0248.buildTypes.*
import Tiger0248.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0248")
    name = "Tiger0248"

    vcsRoot(Tiger0248_cVCSroot)

    buildType(Tiger0248_Hi3)
    buildType(Tiger0248_Hi2)
    buildType(Tiger0248_Hi1)
    buildType(Tiger0248_Hi0)
})
