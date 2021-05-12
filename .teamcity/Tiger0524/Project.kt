package Tiger0524

import Tiger0524.buildTypes.*
import Tiger0524.vcsRoots.*
import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project

object Project : Project({
    id("Tiger0524")
    name = "Tiger0524"

    vcsRoot(Tiger0524_cVCSroot)

    buildType(Tiger0524_Hi3)
    buildType(Tiger0524_Hi2)
    buildType(Tiger0524_Hi1)
    buildType(Tiger0524_Hi0)
})
